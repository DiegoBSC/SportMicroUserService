package com.sport.system.play.sportuserservice.presenter;

import com.sport.system.play.sportuserservice.enums.EnumStatusGeneral;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PermissionsPresenter {

    private UUID id;
    @NotNull
    private String name;
    private EnumStatusGeneral status;
}
