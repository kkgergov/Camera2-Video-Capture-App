package com.example.android.camera2.video.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.camera2.video.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SelectorFragmentDirections {
  private SelectorFragmentDirections() {
  }

  @NonNull
  public static ActionSelectorToRecordMode actionSelectorToRecordMode(@NonNull String cameraId,
      int width, int height, int fps) {
    return new ActionSelectorToRecordMode(cameraId, width, height, fps);
  }

  @NonNull
  public static ActionSelectorToPreview actionSelectorToPreview(@NonNull String cameraId, int width,
      int height, int fps, boolean useHardware) {
    return new ActionSelectorToPreview(cameraId, width, height, fps, useHardware);
  }

  public static class ActionSelectorToRecordMode implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSelectorToRecordMode(@NonNull String cameraId, int width, int height, int fps) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("width", width);
      this.arguments.put("height", height);
      this.arguments.put("fps", fps);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToRecordMode setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToRecordMode setWidth(int width) {
      this.arguments.put("width", width);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToRecordMode setHeight(int height) {
      this.arguments.put("height", height);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToRecordMode setFps(int fps) {
      this.arguments.put("fps", fps);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("camera_id")) {
        String cameraId = (String) arguments.get("camera_id");
        __result.putString("camera_id", cameraId);
      }
      if (arguments.containsKey("width")) {
        int width = (int) arguments.get("width");
        __result.putInt("width", width);
      }
      if (arguments.containsKey("height")) {
        int height = (int) arguments.get("height");
        __result.putInt("height", height);
      }
      if (arguments.containsKey("fps")) {
        int fps = (int) arguments.get("fps");
        __result.putInt("fps", fps);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_selector_to_record_mode;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCameraId() {
      return (String) arguments.get("camera_id");
    }

    @SuppressWarnings("unchecked")
    public int getWidth() {
      return (int) arguments.get("width");
    }

    @SuppressWarnings("unchecked")
    public int getHeight() {
      return (int) arguments.get("height");
    }

    @SuppressWarnings("unchecked")
    public int getFps() {
      return (int) arguments.get("fps");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSelectorToRecordMode that = (ActionSelectorToRecordMode) object;
      if (arguments.containsKey("camera_id") != that.arguments.containsKey("camera_id")) {
        return false;
      }
      if (getCameraId() != null ? !getCameraId().equals(that.getCameraId()) : that.getCameraId() != null) {
        return false;
      }
      if (arguments.containsKey("width") != that.arguments.containsKey("width")) {
        return false;
      }
      if (getWidth() != that.getWidth()) {
        return false;
      }
      if (arguments.containsKey("height") != that.arguments.containsKey("height")) {
        return false;
      }
      if (getHeight() != that.getHeight()) {
        return false;
      }
      if (arguments.containsKey("fps") != that.arguments.containsKey("fps")) {
        return false;
      }
      if (getFps() != that.getFps()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getCameraId() != null ? getCameraId().hashCode() : 0);
      result = 31 * result + getWidth();
      result = 31 * result + getHeight();
      result = 31 * result + getFps();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSelectorToRecordMode(actionId=" + getActionId() + "){"
          + "cameraId=" + getCameraId()
          + ", width=" + getWidth()
          + ", height=" + getHeight()
          + ", fps=" + getFps()
          + "}";
    }
  }

  public static class ActionSelectorToPreview implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSelectorToPreview(@NonNull String cameraId, int width, int height, int fps,
        boolean useHardware) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("width", width);
      this.arguments.put("height", height);
      this.arguments.put("fps", fps);
      this.arguments.put("useHardware", useHardware);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToPreview setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToPreview setWidth(int width) {
      this.arguments.put("width", width);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToPreview setHeight(int height) {
      this.arguments.put("height", height);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToPreview setFps(int fps) {
      this.arguments.put("fps", fps);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorToPreview setUseHardware(boolean useHardware) {
      this.arguments.put("useHardware", useHardware);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("camera_id")) {
        String cameraId = (String) arguments.get("camera_id");
        __result.putString("camera_id", cameraId);
      }
      if (arguments.containsKey("width")) {
        int width = (int) arguments.get("width");
        __result.putInt("width", width);
      }
      if (arguments.containsKey("height")) {
        int height = (int) arguments.get("height");
        __result.putInt("height", height);
      }
      if (arguments.containsKey("fps")) {
        int fps = (int) arguments.get("fps");
        __result.putInt("fps", fps);
      }
      if (arguments.containsKey("useHardware")) {
        boolean useHardware = (boolean) arguments.get("useHardware");
        __result.putBoolean("useHardware", useHardware);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_selector_to_preview;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCameraId() {
      return (String) arguments.get("camera_id");
    }

    @SuppressWarnings("unchecked")
    public int getWidth() {
      return (int) arguments.get("width");
    }

    @SuppressWarnings("unchecked")
    public int getHeight() {
      return (int) arguments.get("height");
    }

    @SuppressWarnings("unchecked")
    public int getFps() {
      return (int) arguments.get("fps");
    }

    @SuppressWarnings("unchecked")
    public boolean getUseHardware() {
      return (boolean) arguments.get("useHardware");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSelectorToPreview that = (ActionSelectorToPreview) object;
      if (arguments.containsKey("camera_id") != that.arguments.containsKey("camera_id")) {
        return false;
      }
      if (getCameraId() != null ? !getCameraId().equals(that.getCameraId()) : that.getCameraId() != null) {
        return false;
      }
      if (arguments.containsKey("width") != that.arguments.containsKey("width")) {
        return false;
      }
      if (getWidth() != that.getWidth()) {
        return false;
      }
      if (arguments.containsKey("height") != that.arguments.containsKey("height")) {
        return false;
      }
      if (getHeight() != that.getHeight()) {
        return false;
      }
      if (arguments.containsKey("fps") != that.arguments.containsKey("fps")) {
        return false;
      }
      if (getFps() != that.getFps()) {
        return false;
      }
      if (arguments.containsKey("useHardware") != that.arguments.containsKey("useHardware")) {
        return false;
      }
      if (getUseHardware() != that.getUseHardware()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getCameraId() != null ? getCameraId().hashCode() : 0);
      result = 31 * result + getWidth();
      result = 31 * result + getHeight();
      result = 31 * result + getFps();
      result = 31 * result + (getUseHardware() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSelectorToPreview(actionId=" + getActionId() + "){"
          + "cameraId=" + getCameraId()
          + ", width=" + getWidth()
          + ", height=" + getHeight()
          + ", fps=" + getFps()
          + ", useHardware=" + getUseHardware()
          + "}";
    }
  }
}
