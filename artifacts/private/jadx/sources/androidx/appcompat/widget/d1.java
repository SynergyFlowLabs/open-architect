package androidx.appcompat.widget;

import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class d1 implements InspectionCompanion<SwitchCompat> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11237a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f11250n;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull SwitchCompat switchCompat, @NonNull PropertyReader propertyReader) {
        if (!this.f11237a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11238b, switchCompat.getTextOff());
        propertyReader.readObject(this.f11239c, switchCompat.getTextOn());
        propertyReader.readObject(this.f11240d, switchCompat.getThumbDrawable());
        propertyReader.readBoolean(this.f11241e, switchCompat.getShowText());
        propertyReader.readBoolean(this.f11242f, switchCompat.getSplitTrack());
        propertyReader.readInt(this.f11243g, switchCompat.getSwitchMinWidth());
        propertyReader.readInt(this.f11244h, switchCompat.getSwitchPadding());
        propertyReader.readInt(this.f11245i, switchCompat.getThumbTextPadding());
        propertyReader.readObject(this.f11246j, switchCompat.getThumbTintList());
        propertyReader.readObject(this.f11247k, switchCompat.getThumbTintMode());
        propertyReader.readObject(this.f11248l, switchCompat.getTrackDrawable());
        propertyReader.readObject(this.f11249m, switchCompat.getTrackTintList());
        propertyReader.readObject(this.f11250n, switchCompat.getTrackTintMode());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11238b = propertyMapper.mapObject("textOff", R.attr.textOff);
        this.f11239c = propertyMapper.mapObject("textOn", R.attr.textOn);
        this.f11240d = propertyMapper.mapObject("thumb", R.attr.thumb);
        this.f11241e = propertyMapper.mapBoolean("showText", i.a.b.T2);
        this.f11242f = propertyMapper.mapBoolean("splitTrack", i.a.b.Z2);
        this.f11243g = propertyMapper.mapInt("switchMinWidth", i.a.b.f285937j3);
        this.f11244h = propertyMapper.mapInt("switchPadding", i.a.b.f285943k3);
        this.f11245i = propertyMapper.mapInt("thumbTextPadding", i.a.b.B3);
        this.f11246j = propertyMapper.mapObject("thumbTint", i.a.b.C3);
        this.f11247k = propertyMapper.mapObject("thumbTintMode", i.a.b.D3);
        this.f11248l = propertyMapper.mapObject("track", i.a.b.Y3);
        this.f11249m = propertyMapper.mapObject("trackTint", i.a.b.Z3);
        this.f11250n = propertyMapper.mapObject("trackTintMode", i.a.b.f285884a4);
        this.f11237a = true;
    }
}
