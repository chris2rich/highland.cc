package me.zeroeightsix.kami.setting.builder.primitive;

import me.zeroeightsix.kami.setting.Setting;
import me.zeroeightsix.kami.setting.builder.SettingBuilder;
import me.zeroeightsix.kami.setting.impl.EnumSetting;

public class EnumSettingBuilder<T extends Enum> extends SettingBuilder<T> {
   Class<? extends Enum> clazz;

   public EnumSettingBuilder(Class<? extends Enum> clazz) {
      this.clazz = clazz;
   }

   public Setting<T> build() {
      return new EnumSetting((Enum)this.initialValue, this.predicate(), this.consumer(), this.name, this.visibilityPredicate(), this.clazz);
   }
}
