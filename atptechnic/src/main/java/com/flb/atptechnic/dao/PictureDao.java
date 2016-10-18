package com.flb.atptechnic.dao;

import org.springframework.stereotype.Repository;
import com.flb.atptechnic.model.Picture;
import com.flb.base.dao.BaseDao;
/**
 * Dao：持久层接口
 * @author Flb
 *
 */
@Repository("pictureDao")
public interface PictureDao extends BaseDao<Picture> {
	
}