package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class g implements InspectionCompanion<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11280a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11288i;

    class a implements IntFunction<String> {
        a() {
        }

        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? String.valueOf(i10) : "uniform";
            }
            return "none";
        }
    }

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull h hVar, @NonNull PropertyReader propertyReader) {
        if (!this.f11280a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f11281b, hVar.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f11282c, hVar.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f11283d, hVar.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f11284e, hVar.getAutoSizeTextType());
        propertyReader.readObject(this.f11285f, hVar.getBackgroundTintList());
        propertyReader.readObject(this.f11286g, hVar.getBackgroundTintMode());
        propertyReader.readObject(this.f11287h, hVar.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11288i, hVar.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11281b = propertyMapper.mapInt("autoSizeMaxTextSize", i.a.b.T);
        this.f11282c = propertyMapper.mapInt("autoSizeMinTextSize", i.a.b.U);
        this.f11283d = propertyMapper.mapInt("autoSizeStepGranularity", i.a.b.W);
        this.f11284e = propertyMapper.mapIntEnum("autoSizeTextType", i.a.b.X, new a());
        this.f11285f = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11286g = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11287h = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11288i = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11280a = true;
    }
}
