package com.document_management.Entity;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "DocMimeType")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocMimeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="docMimeTypeId")
    private Integer docMimeTypeId;

    @Column(name = "docMimeTypeName")
    private String docMimeTypeName;
}
