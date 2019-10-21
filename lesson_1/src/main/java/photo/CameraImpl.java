package photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("camera")
@Scope("prototype")
public class CameraImpl implements Camera {

    @Autowired
    @Qualifier("cameraRoll")
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Autowired
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        if (isBroken()) {
            System.out.println("Camera is broken");
            return;
        }
        System.out.println("Photo taken!");
        cameraRoll.processing();
    }

    public void breaking() {
        this.broken = true;
    }

    public boolean isBroken() {
        return broken;
    }
}
