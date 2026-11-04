package io.sentry.android.core.internal.threaddump;

import io.sentry.n8;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.z;
import io.sentry.u8;
import io.sentry.y7;
import io.sentry.z7;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f304251f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f304252g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f304253h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f304254i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f304255j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f304256k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f304257l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f304258m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f304259n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f304260o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f304261p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f304262q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f304263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f304264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u8 f304265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, DebugImage> f304266d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<b0> f304267e = new ArrayList();

    public c(@NotNull n8 n8Var, boolean z10) {
        this.f304263a = n8Var;
        this.f304264b = z10;
        this.f304265c = new u8(n8Var);
    }

    @Nullable
    private static String a(@NotNull String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10" + str, 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    private void b(@NotNull b0 b0Var, @NotNull z7 z7Var) {
        Map<String, z7> mapK = b0Var.k();
        if (mapK == null) {
            mapK = new HashMap<>();
        }
        z7 z7Var2 = mapK.get(z7Var.f());
        if (z7Var2 != null) {
            z7Var2.o(Math.max(z7Var2.j(), z7Var.j()));
        } else {
            mapK.put(z7Var.f(), new z7(z7Var));
        }
        b0Var.x(mapK);
    }

    @Nullable
    private Integer d(@NotNull Matcher matcher, int i10, @Nullable Integer num) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    @Nullable
    private Long e(@NotNull Matcher matcher, int i10, @Nullable Long l10) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? l10 : Long.valueOf(Long.parseLong(strGroup));
    }

    @Nullable
    private Integer g(@NotNull Matcher matcher, int i10, @Nullable Integer num) {
        String strGroup = matcher.group(i10);
        if (strGroup != null && strGroup.length() != 0) {
            int i11 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    private boolean h(@NotNull Matcher matcher, @NotNull String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    @NotNull
    private a0 j(@NotNull b bVar, @NotNull b0 b0Var) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f304253h.matcher("");
        Matcher matcher2 = f304254i.matcher("");
        Matcher matcher3 = f304255j.matcher("");
        Matcher matcher4 = f304256k.matcher("");
        Matcher matcher5 = f304258m.matcher("");
        Matcher matcher6 = f304257l.matcher("");
        Matcher matcher7 = f304260o.matcher("");
        Matcher matcher8 = f304259n.matcher("");
        Matcher matcher9 = f304261p.matcher("");
        Matcher matcher10 = f304262q.matcher("");
        z zVar = null;
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f304263a.getLogger().c(y7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = aVarB.f304246b;
            matcher10 = matcher10;
            if (h(matcher2, str)) {
                zVar = new z();
                String str2 = String.format("%s.%s", matcher2.group(1), matcher2.group(2));
                zVar.d0(str2);
                zVar.X(matcher2.group(3));
                zVar.V(matcher2.group(4));
                zVar.b0(g(matcher2, 5, null));
                zVar.Z(this.f304265c.f(str2));
                arrayList.add(zVar);
                matcher2 = matcher2;
            } else {
                if (h(matcher, str)) {
                    z zVar2 = new z();
                    zVar2.f0(matcher.group(3));
                    zVar2.X(matcher.group(6));
                    zVar2.b0(d(matcher, 7, null));
                    zVar2.a0("0x" + matcher.group(2));
                    zVar2.g0("native");
                    String strGroup = matcher.group(8);
                    String strA = strGroup == null ? null : a(strGroup);
                    if (strA != null) {
                        if (!this.f304266d.containsKey(strA)) {
                            DebugImage debugImage = new DebugImage();
                            debugImage.setDebugId(strA);
                            debugImage.setType("elf");
                            debugImage.setCodeFile(matcher.group(4));
                            debugImage.setCodeId(strGroup);
                            this.f304266d.put(strA, debugImage);
                        }
                        zVar2.S("rel:" + strA);
                    } else {
                        matcher2 = matcher2;
                    }
                    arrayList.add(zVar2);
                    zVar = null;
                } else {
                    matcher2 = matcher2;
                    if (h(matcher3, str)) {
                        zVar = new z();
                        String str3 = String.format("%s.%s", matcher3.group(1), matcher3.group(2));
                        zVar.d0(str3);
                        zVar.X(matcher3.group(3));
                        zVar.Z(this.f304265c.f(str3));
                        zVar.e0(Boolean.TRUE);
                        arrayList.add(zVar);
                    } else if (h(matcher4, str)) {
                        if (zVar != null) {
                            z7 z7Var = new z7();
                            z7Var.o(1);
                            z7Var.k(matcher4.group(1));
                            z7Var.m(matcher4.group(2));
                            z7Var.l(matcher4.group(3));
                            zVar.c0(z7Var);
                            b(b0Var, z7Var);
                        }
                    } else if (h(matcher5, str)) {
                        if (zVar != null) {
                            z7 z7Var2 = new z7();
                            z7Var2.o(2);
                            z7Var2.k(matcher5.group(1));
                            z7Var2.m(matcher5.group(2));
                            z7Var2.l(matcher5.group(3));
                            zVar.c0(z7Var2);
                            b(b0Var, z7Var2);
                        }
                    } else if (!h(matcher6, str)) {
                        if (!h(matcher7, str)) {
                            if (!h(matcher8, str)) {
                                if (!h(matcher9, str)) {
                                    if (str.length() == 0) {
                                        break;
                                    }
                                    matcher10 = matcher10;
                                    if (h(matcher10, str)) {
                                        break;
                                    }
                                } else if (zVar != null) {
                                    z7 z7Var3 = new z7();
                                    z7Var3.o(8);
                                    zVar.c0(z7Var3);
                                    b(b0Var, z7Var3);
                                }
                            } else if (zVar != null) {
                                z7 z7Var4 = new z7();
                                z7Var4.o(8);
                                z7Var4.k(matcher8.group(1));
                                z7Var4.m(matcher8.group(2));
                                z7Var4.l(matcher8.group(3));
                                zVar.c0(z7Var4);
                                b(b0Var, z7Var4);
                            }
                        } else if (zVar != null) {
                            z7 z7Var5 = new z7();
                            z7Var5.o(8);
                            z7Var5.k(matcher7.group(1));
                            z7Var5.m(matcher7.group(2));
                            z7Var5.l(matcher7.group(3));
                            z7Var5.n(e(matcher7, 4, null));
                            zVar.c0(z7Var5);
                            b(b0Var, z7Var5);
                        }
                        matcher10 = matcher10;
                    } else if (zVar != null) {
                        z7 z7Var6 = new z7();
                        z7Var6.o(4);
                        z7Var6.k(matcher6.group(1));
                        z7Var6.m(matcher6.group(2));
                        z7Var6.l(matcher6.group(3));
                        zVar.c0(z7Var6);
                        b(b0Var, z7Var6);
                    }
                }
                matcher2 = matcher2;
            }
            matcher2 = matcher2;
        }
        Collections.reverse(arrayList);
        a0 a0Var = new a0(arrayList);
        a0Var.i(Boolean.TRUE);
        return a0Var;
    }

    private b0 k(@NotNull b bVar) {
        b0 b0Var = new b0();
        Matcher matcher = f304251f.matcher("");
        Matcher matcher2 = f304252g.matcher("");
        if (!bVar.a()) {
            return null;
        }
        a aVarB = bVar.b();
        boolean z10 = false;
        if (aVarB == null) {
            this.f304263a.getLogger().c(y7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (h(matcher, aVarB.f304246b)) {
            Long lE = e(matcher, 4, null);
            if (lE == null) {
                this.f304263a.getLogger().c(y7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            b0Var.y(lE);
            b0Var.A(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    b0Var.D(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    b0Var.D(strGroup);
                }
            }
        } else if (h(matcher2, aVarB.f304246b)) {
            Long lE2 = e(matcher2, 3, null);
            if (lE2 == null) {
                this.f304263a.getLogger().c(y7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            b0Var.y(lE2);
            b0Var.A(matcher2.group(1));
        }
        String strM = b0Var.m();
        if (strM != null) {
            boolean zEquals = strM.equals(b0.b.f306153h);
            b0Var.z(Boolean.valueOf(zEquals));
            b0Var.u(Boolean.valueOf(zEquals));
            if (zEquals && !this.f304264b) {
                z10 = true;
            }
            b0Var.v(Boolean.valueOf(z10));
        }
        b0Var.C(j(bVar, b0Var));
        return b0Var;
    }

    @NotNull
    public List<DebugImage> c() {
        return new ArrayList(this.f304266d.values());
    }

    @NotNull
    public List<b0> f() {
        return this.f304267e;
    }

    public void i(@NotNull b bVar) {
        Matcher matcher = f304251f.matcher("");
        Matcher matcher2 = f304252g.matcher("");
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f304263a.getLogger().c(y7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = aVarB.f304246b;
            if (h(matcher, str) || h(matcher2, str)) {
                bVar.e();
                b0 b0VarK = k(bVar);
                if (b0VarK != null) {
                    this.f304267e.add(b0VarK);
                }
            }
        }
    }
}
