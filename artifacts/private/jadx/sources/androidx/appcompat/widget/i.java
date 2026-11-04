package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class i implements InspectionCompanion<AppCompatCheckBox> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11336a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11342g;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull AppCompatCheckBox appCompatCheckBox, @NonNull PropertyReader propertyReader) {
        if (!this.f11336a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11337b, appCompatCheckBox.getBackgroundTintList());
        propertyReader.readObject(this.f11338c, appCompatCheckBox.getBackgroundTintMode());
        propertyReader.readObject(this.f11339d, appCompatCheckBox.getButtonTintList());
        propertyReader.readObject(this.f11340e, appCompatCheckBox.getButtonTintMode());
        propertyReader.readObject(this.f11341f, appCompatCheckBox.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11342g, appCompatCheckBox.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11337b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11338c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11339d = propertyMapper.mapObject("buttonTint", i.a.b.f285973q0);
        this.f11340e = propertyMapper.mapObject("buttonTintMode", i.a.b.f285978r0);
        this.f11341f = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11342g = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11336a = true;
    }
}
