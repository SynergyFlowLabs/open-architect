package com.google.android.material.button;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes4.dex */
@w0(29)
@b1({b1.a.LIBRARY})
public final class a implements InspectionCompanion<MaterialButton> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f111649a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111650b;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull MaterialButton materialButton, @NonNull PropertyReader propertyReader) {
        if (!this.f111649a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f111650b, materialButton.getIconPadding());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f111650b = propertyMapper.mapInt("iconPadding", r6.a.c.f359219e9);
        this.f111649a = true;
    }
}
