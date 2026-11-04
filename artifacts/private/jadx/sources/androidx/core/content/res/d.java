package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47634d = "ComplexColorCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f47635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f47636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47637c;

    private d(Shader shader, ColorStateList colorStateList, @androidx.annotation.l int i10) {
        this.f47635a = shader;
        this.f47636b = colorStateList;
        this.f47637c = i10;
    }

    @NonNull
    private static d a(@NonNull Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(g.c(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(@androidx.annotation.l int i10) {
        return new d(null, null, i10);
    }

    static d c(@NonNull ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(@NonNull Shader shader) {
        return new d(shader, null, 0);
    }

    @p0
    public static d g(@NonNull Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @androidx.annotation.l
    public int e() {
        return this.f47637c;
    }

    @p0
    public Shader f() {
        return this.f47635a;
    }

    public boolean h() {
        return this.f47635a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f47635a == null && (colorStateList = this.f47636b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f47636b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f47637c) {
            return false;
        }
        this.f47637c = colorForState;
        return true;
    }

    public void k(@androidx.annotation.l int i10) {
        this.f47637c = i10;
    }

    public boolean l() {
        return h() || this.f47637c != 0;
    }
}
