package com.sport.system.play.sportuserservice.presenter;

import com.sport.system.play.sportuserservice.enums.EnumRol;
import com.sport.system.play.sportuserservice.enums.EnumStatusGeneral;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RolPresenter {

    private UUID id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private EnumRol name;
    @Enumerated(EnumType.STRING)
    private EnumStatusGeneral status;
    private Set<PermissionsPresenter> permissionsPresenters;
}
