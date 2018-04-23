package com.javacodegeeks.snippets.enterprise.hibernate.dao.reposytories;

import com.javacodegeeks.snippets.enterprise.hibernate.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("select b from Cliend b where b.name = :name")
    Client findByName(@Param("name") String name);
}
