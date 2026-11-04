package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class j0 implements InspectionCompanion<AppCompatToggleButton> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11370a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11374e;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull AppCompatToggleButton appCompatToggleButton, @NonNull PropertyReader propertyReader) {
        if (!this.f11370a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11371b, appCompatToggleButton.getBackgroundTintList());
        propertyReader.readObject(this.f11372c, appCompatToggleButton.getBackgroundTintMode());
        propertyReader.readObject(this.f11373d, appCompatToggleButton.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11374e, appCompatToggleButton.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11371b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11372c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11373d = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11374e = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11370a = true;
    }
}
