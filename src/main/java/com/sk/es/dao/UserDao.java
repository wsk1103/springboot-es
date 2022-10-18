package com.sk.es.dao;

import com.sk.es.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sk
 * @time 2022/10/18
 * @desc say
 **/
@Repository
public interface UserDao extends ElasticsearchRepository<User, Long> {
}
