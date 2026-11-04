package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class h0 implements InspectionCompanion<AppCompatTextView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11322a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11330i;

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
    public void readProperties(@NonNull AppCompatTextView appCompatTextView, @NonNull PropertyReader propertyReader) {
        if (!this.f11322a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f11323b, appCompatTextView.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f11324c, appCompatTextView.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f11325d, appCompatTextView.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f11326e, appCompatTextView.getAutoSizeTextType());
        propertyReader.readObject(this.f11327f, appCompatTextView.getBackgroundTintList());
        propertyReader.readObject(this.f11328g, appCompatTextView.getBackgroundTintMode());
        propertyReader.readObject(this.f11329h, appCompatTextView.getCompoundDrawableTintList());
        propertyReader.readObject(this.f11330i, appCompatTextView.getCompoundDrawableTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11323b = propertyMapper.mapInt("autoSizeMaxTextSize", i.a.b.T);
        this.f11324c = propertyMapper.mapInt("autoSizeMinTextSize", i.a.b.U);
        this.f11325d = propertyMapper.mapInt("autoSizeStepGranularity", i.a.b.W);
        this.f11326e = propertyMapper.mapIntEnum("autoSizeTextType", i.a.b.X, new a());
        this.f11327f = propertyMapper.mapObject("backgroundTint", i.a.b.f285886b0);
        this.f11328g = propertyMapper.mapObject("backgroundTintMode", i.a.b.f285892c0);
        this.f11329h = propertyMapper.mapObject("drawableTint", i.a.b.f285947l1);
        this.f11330i = propertyMapper.mapObject("drawableTintMode", i.a.b.f285953m1);
        this.f11322a = true;
    }
}
