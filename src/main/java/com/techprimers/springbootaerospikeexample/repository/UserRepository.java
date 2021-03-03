package com.techprimers.springbootaerospikeexample.repository;


import org.springframework.data.aerospike.repository.AerospikeRepository;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;

public interface UserRepository extends AerospikeRepository<User, Integer> {
}
