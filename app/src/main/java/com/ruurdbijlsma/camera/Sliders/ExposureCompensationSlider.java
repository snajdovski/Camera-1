package com.ruurdbijlsma.camera.Sliders;

import android.content.Context;

import com.ruurdbijlsma.camera.CameraManager.Camera;

/**
 * Gemaakt door ruurd op 11-3-2017.
 */

public class ExposureCompensationSlider extends CameraValueSlider {
    public ExposureCompensationSlider(Context context, Camera camera) {
        super(context, camera, new String[]{
                "-2",
                "-1",
                "0",
                "1",
                "2",
        });
    }

    public void applyToCamera(String value) {
        float compensation = stringToValue(value);
        camera.state.setExposureCompensation((int) compensation);
    }
}
