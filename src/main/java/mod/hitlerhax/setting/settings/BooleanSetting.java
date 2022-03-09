package mod.hitlerhax.setting.settings;

import mod.hitlerhax.Main;
import mod.hitlerhax.module.Module;
import mod.hitlerhax.setting.Setting;

public class BooleanSetting extends Setting {
	public boolean enabled;

	public BooleanSetting(String name, Module parent, boolean enabled) {
		this.name = name;
		this.parent = parent;
		this.enabled = enabled;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;

		if (Main.config != null) {
			Main.config.Save();
		}
	}

	public void toggled() {
		this.enabled = !this.enabled;

		if (Main.config != null) {
			Main.config.Save();
		}
	}

}