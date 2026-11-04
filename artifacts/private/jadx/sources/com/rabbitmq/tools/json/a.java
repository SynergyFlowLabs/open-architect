package com.rabbitmq.tools.json;

import com.planner5d.library.engine.input.f;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.k;

/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f266074e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f266075f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f266076g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f266077h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Character, Character> f266078i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharacterIterator f266079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char f266080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f266081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StringBuilder f266082d = new StringBuilder();

    static {
        HashMap map = new HashMap();
        f266078i = map;
        map.put('\"', '\"');
        map.put('\\', '\\');
        map.put('/', '/');
        map.put('b', '\b');
        map.put('f', '\f');
        map.put('n', '\n');
        map.put('r', Character.valueOf(k.f337188d));
        map.put('t', '\t');
    }

    private void a() {
        b(this.f266080b);
    }

    private void b(char c10) {
        this.f266082d.append(c10);
        e();
    }

    private void c() {
        while (Character.isDigit(this.f266080b)) {
            a();
        }
    }

    private Object d() {
        ArrayList arrayList = new ArrayList();
        Object objH = h();
        while (this.f266081c != f266075f) {
            arrayList.add(objH);
            if (h() == f266077h) {
                objH = h();
            }
        }
        return arrayList;
    }

    private char e() {
        char next = this.f266079a.next();
        this.f266080b = next;
        return next;
    }

    private Object f() {
        this.f266082d.setLength(0);
        if (this.f266080b == '-') {
            a();
        }
        c();
        if (this.f266080b == '.') {
            a();
            c();
        }
        char c10 = this.f266080b;
        if (c10 == 'e' || c10 == 'E') {
            a();
            char c11 = this.f266080b;
            if (c11 == '+' || c11 == '-') {
                a();
            }
            c();
        }
        String string = this.f266082d.toString();
        try {
            return Integer.valueOf(string);
        } catch (NumberFormatException unused) {
            return Double.valueOf(string);
        }
    }

    private Object g() {
        HashMap map = new HashMap();
        String str = (String) h();
        while (true) {
            Object obj = this.f266081c;
            Object obj2 = f266074e;
            if (obj == obj2) {
                return map;
            }
            h();
            if (this.f266081c != obj2) {
                map.put(str, h());
                if (h() == f266077h) {
                    str = (String) h();
                }
            }
        }
    }

    private Object h() {
        Object objK;
        j();
        char c10 = this.f266080b;
        if (c10 == '\"' || c10 == '\'') {
            e();
            objK = k(c10);
        } else if (c10 == '[') {
            e();
            objK = d();
        } else if (c10 == ']') {
            objK = f266075f;
            e();
        } else if (c10 == ',') {
            objK = f266077h;
            e();
        } else if (c10 == '{') {
            e();
            objK = g();
        } else if (c10 == '}') {
            objK = f266074e;
            e();
        } else if (c10 == ':') {
            objK = f266076g;
            e();
        } else if (c10 == 't' && e() == 'r' && e() == 'u' && e() == 'e') {
            objK = Boolean.TRUE;
            e();
        } else if (this.f266080b == 'f' && e() == 'a' && e() == 'l' && e() == 's' && e() == 'e') {
            objK = Boolean.FALSE;
            e();
        } else if (this.f266080b == 'n' && e() == 'u' && e() == 'l' && e() == 'l') {
            e();
            objK = null;
        } else {
            if (!Character.isDigit(this.f266080b) && this.f266080b != '-') {
                throw new IllegalStateException("Found invalid token while parsing JSON (around character " + (this.f266079a.getIndex() - this.f266079a.getBeginIndex()) + "): " + ((Object) null));
            }
            objK = f();
        }
        this.f266081c = objK;
        return objK;
    }

    private void j() {
        while (true) {
            if (Character.isWhitespace(this.f266080b)) {
                e();
            } else {
                if (this.f266080b != '/' || e() != '/') {
                    return;
                }
                while (this.f266080b != '\n') {
                    e();
                }
            }
        }
    }

    private Object k(char c10) {
        this.f266082d.setLength(0);
        while (true) {
            char c11 = this.f266080b;
            if (c11 == c10) {
                e();
                return this.f266082d.toString();
            }
            if (c11 == '\\') {
                e();
                char c12 = this.f266080b;
                if (c12 == 'u') {
                    b(l());
                } else {
                    Character ch2 = f266078i.get(Character.valueOf(c12));
                    if (ch2 != null) {
                        b(ch2.charValue());
                    } else {
                        a();
                    }
                }
            } else {
                a();
            }
        }
    }

    private char l() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            char cE = e();
            switch (cE) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case f.b.f160729t0 /* 56 */:
                case f.b.f160707m /* 57 */:
                    i10 = ((i10 << 4) + this.f266080b) - 48;
                    break;
                default:
                    switch (cE) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case f.b.V /* 68 */:
                        case f.b.f160708m0 /* 69 */:
                        case 'F':
                            i10 = ((i10 << 4) + this.f266080b) - 55;
                            break;
                        default:
                            switch (cE) {
                                case f.b.f160715o1 /* 97 */:
                                case f.b.f160718p1 /* 98 */:
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                    i10 = ((i10 << 4) + this.f266080b) - 87;
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        return (char) i10;
    }

    public Object i(String str) {
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        this.f266079a = stringCharacterIterator;
        this.f266080b = stringCharacterIterator.first();
        return h();
    }
}
