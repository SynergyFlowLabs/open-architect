package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class j implements InspectionCompanion<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11363a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11369g;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull k kVar, @NonNull PropertyReader propertyReader) {
        if (!this.f11363a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11364b, kVar.getBackgroundTintList());
        propertyReader.readObject(this.f11365c, kVar.getBackgroundTintMode());
        propertyReader.readObject(this.f11366d, kVar.getCheckMarkTintList());
        propertyReader.readObject(this.f11367e, kVar.getCheckMarkTintMode());
        propertyReader.readObject(this.f11368f, kVar.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11369g, kVar.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11364b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11365c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11366d = propertyMapper.mapObject("checkMarkTint", i.a.b.f285988t0);
        this.f11367e = propertyMapper.mapObject("checkMarkTintMode", i.a.b.f285993u0);
        this.f11368f = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11369g = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11363a = true;
    }
}
