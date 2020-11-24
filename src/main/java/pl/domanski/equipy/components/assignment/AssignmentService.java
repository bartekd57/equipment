package pl.domanski.equipy.components.assignment;

import org.springframework.stereotype.Service;
import pl.domanski.equipy.components.user.UserRepository;
import pl.domanski.equipy.components.inventory.asset.AssetRepository;

@Service
public class AssignmentService {

    private AssignmentRepository assignmentRepository;
    private AssetRepository assetRepository;
    private UserRepository userRepository;

    public AssignmentService(AssignmentRepository assignmentRepository,
                             AssetRepository assetRepository,
                             UserRepository userRepository) {
        this.assignmentRepository = assignmentRepository;
        this.assetRepository = assetRepository;
        this.userRepository = userRepository;
    }





}
