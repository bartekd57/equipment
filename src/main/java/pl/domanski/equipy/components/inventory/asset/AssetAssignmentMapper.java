package pl.domanski.equipy.components.inventory.asset;

import pl.domanski.equipy.components.user.User;
import pl.domanski.equipy.components.assignment.Assignment;

public class AssetAssignmentMapper {

    static AssetAssignmentDto toDto(Assignment assignment) {
        AssetAssignmentDto dto = new AssetAssignmentDto();
        dto.setId(assignment.getId());
        dto.setStart(assignment.getStart());
        dto.setEnd(assignment.getEnd());

        User user = assignment.getUser();
        dto.setUserId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setPesel(user.getPesel());
        return dto;
    }

}
