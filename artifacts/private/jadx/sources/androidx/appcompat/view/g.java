package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.m0;
import androidx.core.view.p0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f10526e = "SupportMenuInflater";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f10527f = "menu";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f10528g = "group";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f10529h = "item";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f10530i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Class<?>[] f10531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Class<?>[] f10532k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f10533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f10534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f10535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f10536d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f10537c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f10538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f10539b;

        public a(Object obj, String str) {
            this.f10538a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f10539b = cls.getMethod(str, f10537c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f10539b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f10539b.invoke(this.f10538a, menuItem)).booleanValue();
                }
                this.f10539b.invoke(this.f10538a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {
        private static final int G = 0;
        private static final int H = 0;
        private static final int I = 0;
        private static final int J = 0;
        private static final int K = 0;
        private static final boolean L = false;
        private static final boolean M = true;
        private static final boolean N = true;
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f10540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f10546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f10547h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10548i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f10549j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f10550k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f10551l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10552m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f10553n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f10554o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f10555p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f10556q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f10557r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f10558s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f10559t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f10560u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f10561v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f10562w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f10563x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f10564y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f10565z;

        public b(Menu menu) {
            this.f10540a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f10535c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f10558s).setVisible(this.f10559t).setEnabled(this.f10560u).setCheckable(this.f10557r >= 1).setTitleCondensed(this.f10551l).setIcon(this.f10552m);
            int i10 = this.f10561v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f10565z != null) {
                if (g.this.f10535c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f10565z));
            }
            if (this.f10557r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).w(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).j(true);
                }
            }
            String str = this.f10563x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f10531j, g.this.f10533a));
                z10 = true;
            }
            int i11 = this.f10562w;
            if (i11 > 0 && !z10) {
                menuItem.setActionView(i11);
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                p0.l(menuItem, bVar);
            }
            p0.p(menuItem, this.B);
            p0.w(menuItem, this.C);
            p0.o(menuItem, this.f10553n, this.f10554o);
            p0.s(menuItem, this.f10555p, this.f10556q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                p0.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                p0.q(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f10547h = true;
            i(this.f10540a.add(this.f10541b, this.f10548i, this.f10549j, this.f10550k));
        }

        public SubMenu b() {
            this.f10547h = true;
            SubMenu subMenuAddSubMenu = this.f10540a.addSubMenu(this.f10541b, this.f10548i, this.f10549j, this.f10550k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f10547h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f10535c.obtainStyledAttributes(attributeSet, i.a.m.f286509d4);
            this.f10541b = typedArrayObtainStyledAttributes.getResourceId(i.a.m.f286527f4, 0);
            this.f10542c = typedArrayObtainStyledAttributes.getInt(i.a.m.f286545h4, 0);
            this.f10543d = typedArrayObtainStyledAttributes.getInt(i.a.m.f286554i4, 0);
            this.f10544e = typedArrayObtainStyledAttributes.getInt(i.a.m.f286563j4, 0);
            this.f10545f = typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286536g4, true);
            this.f10546g = typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286518e4, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            j1 j1VarF = j1.F(g.this.f10535c, attributeSet, i.a.m.f286572k4);
            this.f10548i = j1VarF.u(i.a.m.f286598n4, 0);
            this.f10549j = (j1VarF.o(i.a.m.f286622q4, this.f10542c) & l1.a.f316127c) | (j1VarF.o(i.a.m.f286630r4, this.f10543d) & 65535);
            this.f10550k = j1VarF.x(i.a.m.f286638s4);
            this.f10551l = j1VarF.x(i.a.m.f286646t4);
            this.f10552m = j1VarF.u(i.a.m.f286581l4, 0);
            this.f10553n = c(j1VarF.w(i.a.m.f286654u4));
            this.f10554o = j1VarF.o(i.a.m.B4, 4096);
            this.f10555p = c(j1VarF.w(i.a.m.f286662v4));
            this.f10556q = j1VarF.o(i.a.m.F4, 4096);
            if (j1VarF.C(i.a.m.f286670w4)) {
                this.f10557r = j1VarF.a(i.a.m.f286670w4, false) ? 1 : 0;
            } else {
                this.f10557r = this.f10544e;
            }
            this.f10558s = j1VarF.a(i.a.m.f286606o4, false);
            this.f10559t = j1VarF.a(i.a.m.f286614p4, this.f10545f);
            this.f10560u = j1VarF.a(i.a.m.f286590m4, this.f10546g);
            this.f10561v = j1VarF.o(i.a.m.G4, -1);
            this.f10565z = j1VarF.w(i.a.m.f286678x4);
            this.f10562w = j1VarF.u(i.a.m.f286686y4, 0);
            this.f10563x = j1VarF.w(i.a.m.A4);
            String strW = j1VarF.w(i.a.m.f286694z4);
            this.f10564y = strW;
            if (strW != null && this.f10562w == 0 && this.f10563x == null) {
                this.A = (androidx.core.view.b) e(strW, g.f10532k, g.this.f10534b);
            } else {
                this.A = null;
            }
            this.B = j1VarF.x(i.a.m.C4);
            this.C = j1VarF.x(i.a.m.H4);
            if (j1VarF.C(i.a.m.E4)) {
                this.E = m0.e(j1VarF.o(i.a.m.E4, -1), this.E);
            } else {
                this.E = null;
            }
            if (j1VarF.C(i.a.m.D4)) {
                this.D = j1VarF.d(i.a.m.D4);
            } else {
                this.D = null;
            }
            j1VarF.I();
            this.f10547h = false;
        }

        public void h() {
            this.f10541b = 0;
            this.f10542c = 0;
            this.f10543d = 0;
            this.f10544e = 0;
            this.f10545f = true;
            this.f10546g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f10531j = clsArr;
        f10532k = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f10535c = context;
        Object[] objArr = {context};
        this.f10533a = objArr;
        this.f10534b = objArr;
    }

    private Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(f10527f)) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals(f10529h)) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals(f10527f)) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals(f10529h)) {
                    bVar.g(attributeSet);
                } else if (name3.equals(f10527f)) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f10536d == null) {
            this.f10536d = a(this.f10535c);
        }
        return this.f10536d;
    }

    @Override // android.view.MenuInflater
    public void inflate(@j0 int i10, Menu menu) {
        if (!(menu instanceof l1.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                try {
                    layout = this.f10535c.getResources().getLayout(i10);
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                    if (menu instanceof androidx.appcompat.view.menu.g) {
                        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) menu;
                        if (gVar.I()) {
                            gVar.n0();
                            z10 = true;
                        }
                    }
                    c(layout, attributeSetAsAttributeSet, menu);
                    if (z10) {
                        ((androidx.appcompat.view.menu.g) menu).m0();
                    }
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.g) menu).m0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
