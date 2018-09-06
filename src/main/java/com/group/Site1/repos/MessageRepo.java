package com.group.Site1.repos;

import org.springframework.data.repository.CrudRepository;

import com.group.Site1.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Long>{
}
