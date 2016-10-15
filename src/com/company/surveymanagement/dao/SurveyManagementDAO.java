package com.company.surveymanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.igate.surveymanagement.Exception.SurveyException;
import com.igate.surveymanagement.bean.SurveyQuestionAnswerBean;
import com.igate.surveymanagement.bean.SurveyQuestionDetailsBean;
import com.igate.surveymanagement.bean.SurveyMasterBean;
import com.igate.surveymanagement.dbutil.DataBaseUtil;

public class SurveyManagementDAO implements ISurveyManagementDAO
{
	Connection con;
	@Override
	public int createSurvry(SurveyMasterBean cr) {
		
		String insertQuery = "insert into survey_masters values(createSurveySequence.nextval,1,?,?,sysdate)";
		String selectQuery = "select max(survey_id) from survey_masters";
		int createSurveyId=0;
		try {
			
			//DataBaseUtil dbutil = DataBaseUtil.getInstance();
			/*if(dbutil != null)
			{
			*/	con = DataBaseUtil.getDb();
				try {
					PreparedStatement psInsert = con.prepareStatement(insertQuery);
					psInsert.setString(1, cr.getSurveyTitle());
					psInsert.setString(2, cr.getSurveyDesc());
					//psInsert.setInt(3, cr.getUserId());
					int rowCount = psInsert.executeUpdate();
					if(rowCount == 1)
					{
						PreparedStatement psSelect = con.prepareStatement(selectQuery);
						ResultSet rsSelect = psSelect.executeQuery();
						rsSelect.next();
						createSurveyId = rsSelect.getInt(1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			//}
			
		} catch (NamingException e) {
		
		} catch (SQLException e) {
		
		}
		return createSurveyId;
	}
	
	@Override
	public boolean editSurvey(SurveyMasterBean cr) {
		//String selectQuery = "select * from survey_master where survey_id=?";
		String updateQuery = "update survey_master set survey_title=?,survey_desc=?,survey_date=? where survey_id = ?";
		try {
			
		/*	DataBaseUtil dbutil = DataBaseUtil.getInstance();
			if(dbutil != null)
			{*/
				con = DataBaseUtil.getDb();
				try {
					PreparedStatement psUpdate = con.prepareStatement(updateQuery);
					psUpdate.setString(1,cr.getSurveyTitle());
					psUpdate.setString(2,cr.getSurveyDesc());
					psUpdate.setDate(3,cr.getSurveyDate());
					psUpdate.setInt(4,cr.getSurveyId());
					int rowCount = psUpdate.executeUpdate();
					if(rowCount == 1)
					{
						return true;
					}
				} catch (SQLException e) {
				
				}
			
			//}
		}catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ResultSet getSurveyDetails(int survey_id) {
		String selectQuery = "select * from survey_master where survey_id = ?";
		ResultSet rsSelect = null;
		try {
/*			Connection con;
			DataBaseUtil dbutil = DataBaseUtil.getInstance();
			if(dbutil != null)
			{
*/				con = DataBaseUtil.getDb();
				try {
					PreparedStatement psSelect = con.prepareStatement(selectQuery);
					psSelect.setInt(1, survey_id);
					rsSelect = psSelect.executeQuery();
					return rsSelect;
				} catch (SQLException e) {
					
				}

			//}
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rsSelect;		
	}

	@Override
	public boolean deleteSurvey(int survey_id) {
		String deleteQuery = "delete from survey_master where survey_id = ?";
		try {
			/*DataBaseUtil dbutil = DataBaseUtil.getInstance();
			Connection con;
			if(dbutil != null)
			{*/
				con = DataBaseUtil.getDb();
				try {
					PreparedStatement psDelete = con.prepareStatement(deleteQuery);
					psDelete.setInt(1, survey_id);
					int rowCount = psDelete.executeUpdate();
					if(rowCount > 0)
					{
						return true;
					}
					
				} catch (SQLException e) {
					
				}
				
			//}	
		}  catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean createQuestion(SurveyQuestionAnswerBean aq) {
		String insertQuery = "insert into question_master values(sequence_question_id.nextval,?,?,?,?,?,?,1,2,3,4)";
		
		try {
			/*DataBaseUtil dbutil = DataBaseUtil.getInstance();
			Connection con;
			if(dbutil != null)
			{*/
				con = DataBaseUtil.getDb();
				try {
					PreparedStatement psInsert = con.prepareStatement(insertQuery);
					psInsert.setInt(1, aq.getSurveyId());
					psInsert.setString(2, aq.getQuestion());
					psInsert.setString(3, aq.getOption1());
					psInsert.setString(4, aq.getOption2());
					psInsert.setString(5, aq.getOption3());
					psInsert.setString(6, aq.getOption4());
					int rowCount = psInsert.executeUpdate();
					if(rowCount == 1)
					{
						return true;
					}
				} catch (SQLException e) {
				
				}
				
				
			//}
		}  catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return false;
	}

	@Override
	public boolean deleteQuestion(int question_id) {
		String deleteQuery="delete from survey_question_details where question_id =?";
		try {
			/*DataBaseUtil dbutil = DataBaseUtil.getInstance();
			Connection con;
			if(dbutil != null)
			{*/
				con = DataBaseUtil.getDb();
				PreparedStatement psDelete;
				try {
					psDelete = con.prepareStatement(deleteQuery);
					psDelete.setInt(1, question_id);
					int rowCount = psDelete.executeUpdate();
					if(rowCount == 1)
					{
						return true;
					}
				} catch (SQLException e) {
				
				}
			
				
			//}
			
		}  catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}

	@Override
	public ResultSet viewQuestionsBySurvey(int survey_id) {
		String selectQuery = "select q.question_id, q.question_text,o.option1,o.option2,o.option3,o.option4" +
				"from survey_question_details q, survey_options_details" +
				"where q.survey_id = ? and q.question_id = o.question_id";
			try {
			/*	DataBaseUtil dbutil = DataBaseUtil.getInstance();
				Connection con;
				if(dbutil != null)
				{*/
					con = DataBaseUtil.getDb();
					try {
						PreparedStatement psSelect = con.prepareStatement(selectQuery);
						psSelect.setInt(1, survey_id);
						ResultSet rsSelect = psSelect.executeQuery();
						return rsSelect;
						
					} catch (SQLException e) {
					
					}
				//}
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return null;
	}

	
	@Override
	public ResultSet viewAllQuestions() {
		String selectQuery = "select q.question_id, q.question_text,o.option1,o.option2,o.option3,o.option4" +
		"from survey_question_details q, survey_options_details" +
		"where q.question_id = o.question_id";
		try {
		/*DataBaseUtil dbutil = DataBaseUtil.getInstance();
		Connection con;
		if(dbutil != null)
		{*/
			con = DataBaseUtil.getDb();
			try {
				PreparedStatement psSelect = con.prepareStatement(selectQuery);
				ResultSet rsSelect = psSelect.executeQuery();
				return rsSelect;
				
			} catch (SQLException e) {
			
			}
		//}
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		return null;
	}

	/* (non-Javadoc)
	 * @see com.igate.surveymanagement.dao.ISurveyManagementDAO#getSurveyByUser(int)
	 */
	@Override
	public List<SurveyMasterBean> getSurveyByUser(int UserId) {
		String selectQuery="select survey_id,survey_title,survey_date from survey_masters where user_id=?";
		SurveyMasterBean sr=null;
		List<SurveyMasterBean> surveyList = new ArrayList<SurveyMasterBean>();
		try {
			con = DataBaseUtil.getDb();
			PreparedStatement psSelect = con.prepareStatement(selectQuery);
			psSelect.setInt(1,UserId);
			ResultSet rs = psSelect.executeQuery();
		
			while(rs.next())
			{
				sr = new SurveyMasterBean();
				sr.setSurveyId(rs.getInt("survey_id"));
				sr.setSurveyTitle(rs.getString("survey_title"));
				sr.setSurveyDate(rs.getDate("survey_date"));
				surveyList.add(sr);
			}
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return surveyList;
	}

}
