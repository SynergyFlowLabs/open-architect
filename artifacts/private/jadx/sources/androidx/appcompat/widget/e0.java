package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class e0 implements InspectionCompanion<AppCompatSpinner> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11255a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11257c;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull AppCompatSpinner appCompatSpinner, @NonNull PropertyReader propertyReader) {
        if (!this.f11255a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11256b, appCompatSpinner.getBackgroundTintList());
        propertyReader.readObject(this.f11257c, appCompatSpinner.getBackgroundTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11256b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11257c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11255a = true;
    }
}
