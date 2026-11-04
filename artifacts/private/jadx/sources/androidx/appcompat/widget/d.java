package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class d implements InspectionCompanion<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11226a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11230e;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull e eVar, @NonNull PropertyReader propertyReader) {
        if (!this.f11226a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11227b, eVar.getBackgroundTintList());
        propertyReader.readObject(this.f11228c, eVar.getBackgroundTintMode());
        propertyReader.readObject(this.f11229d, eVar.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11230e, eVar.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11227b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11228c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11229d = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11230e = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11226a = true;
    }
}
