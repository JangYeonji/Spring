package kr.co.project.bbs.model.sql;

import java.util.List;

public interface BbsDao {

	public List<Object> listRow();
	public Object readRow(Object obj);
	public void upCntRow(Object obj);

}