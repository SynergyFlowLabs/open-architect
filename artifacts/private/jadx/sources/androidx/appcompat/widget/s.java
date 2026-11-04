package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class s implements InspectionCompanion<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11520a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11524e;

    public s() {
        int i10 = 3 ^ 0;
    }

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull t tVar, @NonNull PropertyReader propertyReader) {
        if (!this.f11520a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11521b, tVar.getBackgroundTintList());
        propertyReader.readObject(this.f11522c, tVar.getBackgroundTintMode());
        propertyReader.readObject(this.f11523d, tVar.getImageTintList());
        propertyReader.readObject(this.f11524e, tVar.getImageTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11521b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11522c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11523d = propertyMapper.mapObject("tint", i.a.b.H3);
        this.f11524e = propertyMapper.mapObject("tintMode", i.a.b.I3);
        this.f11520a = true;
    }
}
