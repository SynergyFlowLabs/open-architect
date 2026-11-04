package com.rabbitmq.tools.json;

import com.facebook.internal.z0;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.StringCharacterIterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final char[] f266084d = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f266085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f266086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f266087c;

    public d() {
        this.f266085a = false;
        this.f266086b = 0;
        this.f266087c = new StringBuilder();
    }

    private void a(char c10) {
        this.f266087c.append(c10);
    }

    private void b(Object obj) {
        this.f266087c.append(obj);
    }

    private void c(String str, Object obj) {
        a('\"');
        b(str);
        b("\":");
        o(obj);
    }

    private void d(Object obj) {
        a(AbstractJsonLexerKt.BEGIN_LIST);
        int length = Array.getLength(obj);
        if (length > 0) {
            o(Array.get(obj, 0));
        }
        for (int i10 = 1; i10 < length; i10++) {
            a(AbstractJsonLexerKt.COMMA);
            o(Array.get(obj, i10));
        }
        a(AbstractJsonLexerKt.END_LIST);
    }

    private void e(Iterator<?> it) {
        a(AbstractJsonLexerKt.BEGIN_LIST);
        if (it.hasNext()) {
            o(it.next());
        }
        while (it.hasNext()) {
            a(AbstractJsonLexerKt.COMMA);
            o(it.next());
        }
        a(AbstractJsonLexerKt.END_LIST);
    }

    private void f(Object obj) {
        u(obj.getClass(), obj, null);
    }

    private void g(boolean z10) {
        b(z10 ? z0.P : "false");
    }

    private void i(Map<String, Object> map) {
        a(AbstractJsonLexerKt.BEGIN_OBJ);
        this.f266086b += 2;
        k();
        Iterator<String> it = map.keySet().iterator();
        if (it.hasNext()) {
            j(it.next(), map);
        }
        while (it.hasNext()) {
            a(AbstractJsonLexerKt.COMMA);
            k();
            String next = it.next();
            o(next);
            a(AbstractJsonLexerKt.COLON);
            o(map.get(next));
        }
        this.f266086b -= 2;
        k();
        a(AbstractJsonLexerKt.END_OBJ);
    }

    private void j(Object obj, Map<String, Object> map) {
        o(obj);
        a(AbstractJsonLexerKt.COLON);
        o(map.get(obj));
    }

    private void k() {
        if (this.f266085a) {
            a('\n');
            for (int i10 = 0; i10 < this.f266086b; i10++) {
                a(' ');
            }
        }
    }

    private void m(Object obj) {
        a('\"');
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(obj.toString());
        for (char cFirst = stringCharacterIterator.first(); cFirst != 65535; cFirst = stringCharacterIterator.next()) {
            if (cFirst == '\"') {
                b("\\\"");
            } else if (cFirst == '\\') {
                b("\\\\");
            } else if (cFirst == '/') {
                b("\\/");
            } else if (cFirst == '\b') {
                b("\\b");
            } else if (cFirst == '\f') {
                b("\\f");
            } else if (cFirst == '\n') {
                b("\\n");
            } else if (cFirst == '\r') {
                b("\\r");
            } else if (cFirst == '\t') {
                b("\\t");
            } else if (Character.isISOControl(cFirst)) {
                n(cFirst);
            } else {
                a(cFirst);
            }
        }
        a('\"');
    }

    private void n(char c10) {
        b("\\u");
        int i10 = 0;
        int i11 = c10;
        while (i10 < 4) {
            a(f266084d[(61440 & i11) >> 12]);
            i10++;
            i11 <<= 4;
        }
    }

    private void o(Object obj) {
        if (obj == null) {
            b(AbstractJsonLexerKt.NULL);
            return;
        }
        if (obj instanceof b) {
            ((b) obj).a(this);
            return;
        }
        if (obj instanceof Class) {
            m(obj);
            return;
        }
        if (obj instanceof Boolean) {
            g(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            b(obj);
            return;
        }
        if (obj instanceof String) {
            m(obj);
            return;
        }
        if (obj instanceof Character) {
            m(obj);
            return;
        }
        if (obj instanceof Map) {
            i((Map) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            d(obj);
        } else if (obj instanceof Collection) {
            e(((Collection) obj).iterator());
        } else {
            f(obj);
        }
    }

    public boolean h() {
        return this.f266085a;
    }

    public void l(boolean z10) {
        this.f266085a = z10;
    }

    public Object p(double d10) {
        return s(Double.valueOf(d10));
    }

    public String q(char c10) {
        return s(Character.valueOf(c10));
    }

    public String r(long j10) {
        return s(Long.valueOf(j10));
    }

    public String s(Object obj) {
        this.f266087c.setLength(0);
        o(obj);
        return this.f266087c.toString();
    }

    public String t(boolean z10) {
        return s(Boolean.valueOf(z10));
    }

    public void u(Class<?> cls, Object obj, String[] strArr) {
        HashSet hashSet;
        BeanInfo beanInfo;
        boolean z10;
        Method readMethod;
        if (strArr != null) {
            hashSet = new HashSet();
            for (String str : strArr) {
                hashSet.add(str);
            }
        } else {
            hashSet = null;
        }
        a(AbstractJsonLexerKt.BEGIN_OBJ);
        this.f266086b += 2;
        k();
        try {
            beanInfo = Introspector.getBeanInfo(cls);
        } catch (IntrospectionException unused) {
            beanInfo = null;
        }
        if (beanInfo != null) {
            z10 = false;
            for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                String name = propertyDescriptor.getName();
                if ((hashSet != null || !name.equals("class")) && ((hashSet == null || hashSet.contains(name)) && (readMethod = propertyDescriptor.getReadMethod()) != null && !Modifier.isStatic(readMethod.getModifiers()))) {
                    try {
                        Object objInvoke = readMethod.invoke(obj, null);
                        if (z10) {
                            a(AbstractJsonLexerKt.COMMA);
                            k();
                        }
                        try {
                            c(name, objInvoke);
                        } catch (Exception unused2) {
                        }
                        z10 = true;
                    } catch (Exception unused3) {
                    }
                }
            }
        } else {
            z10 = false;
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            int modifiers = field.getModifiers();
            String name2 = field.getName();
            if ((hashSet == null || hashSet.contains(name2)) && !Modifier.isStatic(modifiers)) {
                try {
                    Object obj2 = field.get(obj);
                    if (z10) {
                        a(AbstractJsonLexerKt.COMMA);
                        k();
                    }
                    try {
                        c(name2, obj2);
                    } catch (Exception unused4) {
                    }
                    z10 = true;
                } catch (Exception unused5) {
                }
            }
        }
        this.f266086b -= 2;
        k();
        a(AbstractJsonLexerKt.END_OBJ);
    }

    public d(boolean z10) {
        this.f266085a = false;
        this.f266086b = 0;
        this.f266087c = new StringBuilder();
        this.f266085a = z10;
    }
}
