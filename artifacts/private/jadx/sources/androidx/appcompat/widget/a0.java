package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class a0 implements InspectionCompanion<AppCompatRadioButton> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11145a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11151g;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull AppCompatRadioButton appCompatRadioButton, @NonNull PropertyReader propertyReader) {
        if (!this.f11145a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11146b, appCompatRadioButton.getBackgroundTintList());
        propertyReader.readObject(this.f11147c, appCompatRadioButton.getBackgroundTintMode());
        propertyReader.readObject(this.f11148d, appCompatRadioButton.getButtonTintList());
        propertyReader.readObject(this.f11149e, appCompatRadioButton.getButtonTintMode());
        propertyReader.readObject(this.f11150f, appCompatRadioButton.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11151g, appCompatRadioButton.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11146b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11147c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11148d = propertyMapper.mapObject("buttonTint", i.a.b.f285973q0);
        this.f11149e = propertyMapper.mapObject("buttonTintMode", i.a.b.f285978r0);
        this.f11150f = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11151g = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11145a = true;
    }
}
