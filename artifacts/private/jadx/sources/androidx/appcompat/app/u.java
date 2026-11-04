package androidx.appcompat.app;

import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Deque<WeakReference<XmlPullParser>> f10385a = new ArrayDeque();

    u() {
    }

    private static boolean b(@p0 XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3 && xmlPullParser.getEventType() != 1) {
                    return false;
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return true;
    }

    @p0
    private static XmlPullParser c(@NonNull Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean d(@NonNull XmlPullParser xmlPullParser, @p0 XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 != null && xmlPullParser != xmlPullParser2) {
            try {
                if (xmlPullParser2.getEventType() == 2) {
                    return "include".equals(xmlPullParser2.getName());
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return false;
    }

    boolean a(@NonNull AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserC = c(this.f10385a);
        this.f10385a.push(new WeakReference<>(xmlPullParser));
        return d(xmlPullParser, xmlPullParserC);
    }
}
