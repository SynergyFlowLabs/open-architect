package androidx.appcompat.widget;

import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class a1 implements InspectionCompanion<SearchView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11152a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11156e;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull SearchView searchView, @NonNull PropertyReader propertyReader) {
        if (!this.f11152a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f11153b, searchView.getImeOptions());
        propertyReader.readInt(this.f11154c, searchView.getMaxWidth());
        propertyReader.readBoolean(this.f11155d, searchView.N());
        propertyReader.readObject(this.f11156e, searchView.getQueryHint());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11153b = propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
        this.f11154c = propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
        this.f11155d = propertyMapper.mapBoolean("iconifiedByDefault", i.a.b.J1);
        this.f11156e = propertyMapper.mapObject("queryHint", i.a.b.G2);
        this.f11152a = true;
    }
}
