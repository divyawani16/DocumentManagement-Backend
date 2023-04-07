package com.document_management.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DocumentVersion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DocumentVersionId")
    private int DocumentVersionId;

    @Column(name = "VersionNumber")
    private int versionNumber;

    @Column(name = "Location")
    private String location;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private Date createdDate;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "UpdatedDate")
    private Date updatedDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documentId", referencedColumnName = "documentId")
    private Document document;
}
