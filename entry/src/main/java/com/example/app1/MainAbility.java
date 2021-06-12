package com.example.app1;

import com.example.app1.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbility extends Ability {
    private int count = 0;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
        Button clickBtn = (Button) findComponentById(ResourceTable.Id_button_click);
        Text welcomeText = (Text) findComponentById(ResourceTable.Id_text_helloworld);

        clickBtn.setClickedListener(component -> {
            welcomeText.setText(count);
            count++;
        });

    }
}
