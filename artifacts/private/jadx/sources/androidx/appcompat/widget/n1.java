package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class n1 implements InspectionCompanion<Toolbar> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11439a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f11452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11457s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11458t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f11459u;

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull Toolbar toolbar, @NonNull PropertyReader propertyReader) {
        if (!this.f11439a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f11440b, toolbar.getCollapseContentDescription());
        propertyReader.readObject(this.f11441c, toolbar.getCollapseIcon());
        propertyReader.readInt(this.f11442d, toolbar.getContentInsetEnd());
        propertyReader.readInt(this.f11443e, toolbar.getContentInsetEndWithActions());
        propertyReader.readInt(this.f11444f, toolbar.getContentInsetLeft());
        propertyReader.readInt(this.f11445g, toolbar.getContentInsetRight());
        propertyReader.readInt(this.f11446h, toolbar.getContentInsetStart());
        propertyReader.readInt(this.f11447i, toolbar.getContentInsetStartWithNavigation());
        propertyReader.readObject(this.f11448j, toolbar.getLogo());
        propertyReader.readObject(this.f11449k, toolbar.getLogoDescription());
        propertyReader.readObject(this.f11450l, toolbar.getMenu());
        propertyReader.readObject(this.f11451m, toolbar.getNavigationContentDescription());
        propertyReader.readObject(this.f11452n, toolbar.getNavigationIcon());
        propertyReader.readResourceId(this.f11453o, toolbar.getPopupTheme());
        propertyReader.readObject(this.f11454p, toolbar.getSubtitle());
        propertyReader.readObject(this.f11455q, toolbar.getTitle());
        propertyReader.readInt(this.f11456r, toolbar.getTitleMarginBottom());
        propertyReader.readInt(this.f11457s, toolbar.getTitleMarginEnd());
        propertyReader.readInt(this.f11458t, toolbar.getTitleMarginStart());
        propertyReader.readInt(this.f11459u, toolbar.getTitleMarginTop());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11440b = propertyMapper.mapObject("collapseContentDescription", i.a.b.f286018z0);
        this.f11441c = propertyMapper.mapObject("collapseIcon", i.a.b.A0);
        this.f11442d = propertyMapper.mapInt("contentInsetEnd", i.a.b.O0);
        this.f11443e = propertyMapper.mapInt("contentInsetEndWithActions", i.a.b.P0);
        this.f11444f = propertyMapper.mapInt("contentInsetLeft", i.a.b.Q0);
        this.f11445g = propertyMapper.mapInt("contentInsetRight", i.a.b.R0);
        this.f11446h = propertyMapper.mapInt("contentInsetStart", i.a.b.S0);
        this.f11447i = propertyMapper.mapInt("contentInsetStartWithNavigation", i.a.b.T0);
        this.f11448j = propertyMapper.mapObject("logo", i.a.b.f285924h2);
        this.f11449k = propertyMapper.mapObject("logoDescription", i.a.b.f285930i2);
        this.f11450l = propertyMapper.mapObject("menu", i.a.b.f285948l2);
        this.f11451m = propertyMapper.mapObject("navigationContentDescription", i.a.b.f285960n2);
        this.f11452n = propertyMapper.mapObject("navigationIcon", i.a.b.f285965o2);
        this.f11453o = propertyMapper.mapResourceId("popupTheme", i.a.b.A2);
        this.f11454p = propertyMapper.mapObject("subtitle", i.a.b.f285907e3);
        this.f11455q = propertyMapper.mapObject("title", i.a.b.J3);
        this.f11456r = propertyMapper.mapInt("titleMarginBottom", i.a.b.L3);
        this.f11457s = propertyMapper.mapInt("titleMarginEnd", i.a.b.M3);
        this.f11458t = propertyMapper.mapInt("titleMarginStart", i.a.b.N3);
        this.f11459u = propertyMapper.mapInt("titleMarginTop", i.a.b.O3);
        this.f11439a = true;
    }
}
