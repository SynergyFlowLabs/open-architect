package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class o implements InspectionCompanion<AppCompatEditText> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11460a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11464e;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull AppCompatEditText appCompatEditText, @NonNull PropertyReader propertyReader) {
        if (!this.f11460a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11461b, appCompatEditText.getBackgroundTintList());
        propertyReader.readObject(this.f11462c, appCompatEditText.getBackgroundTintMode());
        propertyReader.readObject(this.f11463d, appCompatEditText.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11464e, appCompatEditText.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11461b = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11462c = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11463d = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11464e = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11460a = true;
    }
}
