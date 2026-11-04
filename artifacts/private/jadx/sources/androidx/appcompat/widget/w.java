package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class w implements InspectionCompanion<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11633a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11637e;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull x xVar, @NonNull PropertyReader propertyReader) {
        if (!this.f11633a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11634b, xVar.getBackgroundTintList());
        propertyReader.readObject(this.f11635c, xVar.getBackgroundTintMode());
        propertyReader.readObject(this.f11636d, xVar.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11637e, xVar.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11634b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11635c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11636d = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11637e = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11633a = true;
    }
}
