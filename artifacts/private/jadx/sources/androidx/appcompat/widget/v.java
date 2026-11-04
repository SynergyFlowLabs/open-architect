package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class v implements InspectionCompanion<AppCompatImageView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11614a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11618e;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull AppCompatImageView appCompatImageView, @NonNull PropertyReader propertyReader) {
        if (!this.f11614a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11615b, appCompatImageView.getBackgroundTintList());
        propertyReader.readObject(this.f11616c, appCompatImageView.getBackgroundTintMode());
        propertyReader.readObject(this.f11617d, appCompatImageView.getImageTintList());
        propertyReader.readObject(this.f11618e, appCompatImageView.getImageTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11615b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11616c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11617d = propertyMapper.mapObject("tint", i.a.b.H3);
        this.f11618e = propertyMapper.mapObject("tintMode", i.a.b.I3);
        this.f11614a = true;
    }
}
