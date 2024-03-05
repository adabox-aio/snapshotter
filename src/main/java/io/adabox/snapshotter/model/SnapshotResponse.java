package io.adabox.snapshotter.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SnapshotResponse {

    @Schema(example = "Error Creating Snapshot")
    private String message;

    @Schema(example = "52f41186-8f35-4557-ab23-077b1eef1d9b")
    private String snapshotId;

    @Schema(example = "queued")
    private SnapshotRequestStatus status;
}
