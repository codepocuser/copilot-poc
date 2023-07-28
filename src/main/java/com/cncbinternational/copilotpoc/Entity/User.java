package com.cncbinternational.copilotpoc.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @NotNull
    @NotEmpty
    private UUID id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String email;


}