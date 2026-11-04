package com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemWindow;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nUpdateWindowsAndDoorsInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateWindowsAndDoorsInteractor.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/interactor/UpdateWindowsAndDoorsInteractor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,48:1\n13409#2,2:49\n*S KotlinDebug\n*F\n+ 1 UpdateWindowsAndDoorsInteractor.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/interactor/UpdateWindowsAndDoorsInteractor\n*L\n16#1:49,2\n*E\n"})
public final class e implements na.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f135532a = 0;

    @ij.a
    public e() {
    }

    private final ItemLayout b(ItemLayout itemLayout, JSONObject jSONObject) {
        try {
            if (jSONObject.has("scale")) {
                JSONArray jSONArray = jSONObject.getJSONArray("scale");
                itemLayout.setScale((float) jSONArray.getDouble(0), (float) jSONArray.getDouble(1), (float) jSONArray.getDouble(2));
            }
            if (jSONObject.has("position")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("position");
                itemLayout.setPosition((float) jSONArray2.getDouble(0), (float) jSONArray2.getDouble(1), (float) jSONArray2.getDouble(2));
            }
            if (jSONObject.has(androidx.constraintlayout.motion.widget.f.f45124i)) {
                JSONArray jSONArray3 = jSONObject.getJSONArray(androidx.constraintlayout.motion.widget.f.f45124i);
                itemLayout.setRotation((float) jSONArray3.getDouble(0), (float) jSONArray3.getDouble(1), (float) jSONArray3.getDouble(2));
            }
        } catch (JSONException unused) {
        }
        return itemLayout;
    }

    @Override // na.c
    public void a(@NotNull ItemProject item, @NotNull Bundle doorWindowPositions) {
        ItemWindow[] windows;
        String string;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(doorWindowPositions, "doorWindowPositions");
        if (doorWindowPositions.isEmpty()) {
            return;
        }
        ItemLayout itemLayout = new ItemLayout();
        ItemFloor activeFloor = item.getActiveFloor();
        if (activeFloor == null || (windows = activeFloor.getWindows()) == null) {
            return;
        }
        for (ItemWindow itemWindow : windows) {
            if (doorWindowPositions.containsKey(itemWindow.getUid()) && (string = doorWindowPositions.getString(itemWindow.getUid())) != null) {
                b(itemLayout, new JSONObject(string));
                itemWindow.setLayout(itemLayout);
            }
        }
    }
}
