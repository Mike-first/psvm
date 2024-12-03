package com.hill.dbconnector.queries;

import com.hill.dbconnector.dto.ClientDTO;
import com.hill.dbconnector.objects.Client;
import com.hill.dbconnector.objects.QClient;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ClientQueries {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Client> getClientsOlderThan18() {
        QClient qClient = QClient.client;
        JPAQuery<Client> query = new JPAQuery<>(entityManager);
        return query.select(qClient)
                .from(qClient)
                .where(qClient.age.gt(18))
                .fetch();
    }

    public List<Client> getClientsSortedByLastName() {
        QClient qClient = QClient.client;
        JPAQuery<Client> query = new JPAQuery<>(entityManager);
        return query.select(qClient)
                .from(qClient)
                .orderBy(qClient.lastName.asc())
                .fetch();
    }

    public List<Client> getClientsByFullName(String firstName, String lastName) {
        QClient qClient = QClient.client;
        JPAQuery<Client> query = new JPAQuery<>(entityManager);
        return query.select(qClient)
                .from(qClient)
                .where(qClient.firstName.eq(firstName)
                        .and(qClient.lastName.eq(lastName))
                        .and(qClient.age.gt(18)))
                .fetch();
    }

    public List<ClientDTO> getClientDTOs() {
        QClient qClient = QClient.client;
        JPAQuery<ClientDTO> query = new JPAQuery<>(entityManager);
        return query.select(Projections.constructor(ClientDTO.class,
                        qClient.firstName,
                        qClient.lastName,
                        qClient.age))
                .from(qClient)
                .fetch();
    }
}

