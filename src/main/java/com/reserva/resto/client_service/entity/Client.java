package com.reserva.resto.client_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "tbl_Client")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "document_id", nullable = false)
    private String documentId;

    @Column (name = "email", nullable = false)
    private String email;

    @Column (name = "cellphone_number", nullable = false)
    private String cellphoneNumber;

    @Column (name = "address", nullable = false)
    //luego va a ser cambiado para poder agregar una clase llamada dirección
    private String address;

    @Column (name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column (name = "creation_user")
    private String creationUser;

    @Column (name = "modification_date")
    private Date modificationDate;

    @Column (name = "modification_user")
    private String modificationUser;

    @Column (name = "leaving_date")
    private Date leavingDate;

    @Column (name = "leaving_user")
    private String leavingUser;

}
