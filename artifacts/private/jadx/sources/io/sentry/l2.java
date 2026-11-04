package io.sentry;

import io.sentry.protocol.DebugImage;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l2 implements n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f305816c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Class<?>, a2<?>> f305818b;

    public l2(@NotNull n8 n8Var) {
        this.f305817a = n8Var;
        HashMap map = new HashMap();
        this.f305818b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.protocol.a.C2227a());
        map.put(f.class, new f.a());
        map.put(io.sentry.protocol.b.class, new io.sentry.protocol.b.a());
        map.put(io.sentry.protocol.c.class, new io.sentry.protocol.c.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(io.sentry.protocol.d.class, new io.sentry.protocol.d.a());
        map.put(io.sentry.protocol.e.class, new io.sentry.protocol.e.a());
        map.put(io.sentry.protocol.e.b.class, new io.sentry.protocol.e.b.a());
        map.put(io.sentry.protocol.f.class, new io.sentry.protocol.f.a());
        map.put(io.sentry.protocol.h.class, new io.sentry.protocol.h.a());
        map.put(io.sentry.protocol.i.class, new io.sentry.protocol.i.a());
        map.put(io.sentry.protocol.j.class, new io.sentry.protocol.j.a());
        map.put(io.sentry.protocol.k.class, new io.sentry.protocol.k.a());
        map.put(io.sentry.protocol.l.class, new io.sentry.protocol.l.a());
        map.put(g4.class, new g4.b());
        map.put(h4.class, new h4.a());
        map.put(k4.class, new k4.b());
        map.put(l4.class, new l4.a());
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.profilemeasurements.a.C2225a());
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.profilemeasurements.b.a());
        map.put(io.sentry.protocol.m.class, new io.sentry.protocol.m.a());
        map.put(p4.class, new p4.b());
        map.put(io.sentry.rrweb.a.class, new io.sentry.rrweb.a.C2231a());
        map.put(io.sentry.rrweb.c.class, new io.sentry.rrweb.c.a());
        map.put(io.sentry.rrweb.e.class, new io.sentry.rrweb.e.a());
        map.put(io.sentry.rrweb.f.class, new io.sentry.rrweb.f.a());
        map.put(io.sentry.rrweb.g.class, new io.sentry.rrweb.g.a());
        map.put(io.sentry.rrweb.i.class, new io.sentry.rrweb.i.a());
        map.put(io.sentry.rrweb.j.class, new io.sentry.rrweb.j.a());
        map.put(io.sentry.protocol.o.class, new io.sentry.protocol.o.a());
        map.put(io.sentry.protocol.p.class, new io.sentry.protocol.p.a());
        map.put(h6.class, new h6.a());
        map.put(n7.class, new n7.a());
        map.put(o7.class, new o7.a());
        map.put(io.sentry.protocol.q.class, new io.sentry.protocol.q.a());
        map.put(x7.class, new x7.a());
        map.put(y7.class, new y7.a());
        map.put(z7.class, new z7.a());
        map.put(c8.class, new c8.a());
        map.put(io.sentry.protocol.w.class, new io.sentry.protocol.w.a());
        map.put(io.sentry.protocol.x.class, new io.sentry.protocol.x.a());
        map.put(o8.class, new o8.a());
        map.put(io.sentry.protocol.y.class, new io.sentry.protocol.y.a());
        map.put(io.sentry.protocol.z.class, new io.sentry.protocol.z.a());
        map.put(io.sentry.protocol.a0.class, new io.sentry.protocol.a0.a());
        map.put(u5.class, new u5.a());
        map.put(io.sentry.protocol.b0.class, new io.sentry.protocol.b0.a());
        map.put(io.sentry.protocol.c0.class, new io.sentry.protocol.c0.a());
        map.put(k9.class, new k9.a());
        map.put(p9.class, new p9.a());
        map.put(v9.class, new v9.a());
        map.put(x9.class, new x9.a());
        map.put(io.sentry.protocol.g0.class, new io.sentry.protocol.g0.a());
        map.put(io.sentry.protocol.g.class, new io.sentry.protocol.g.a());
        map.put(na.class, new na.a());
        map.put(io.sentry.clientreport.c.class, new io.sentry.clientreport.c.a());
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.i0.a());
        map.put(io.sentry.protocol.h0.class, new io.sentry.protocol.h0.a());
    }

    private <T> boolean g(@NotNull Class<T> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    @NotNull
    private String h(Object obj, boolean z10) throws IOException {
        StringWriter stringWriter = new StringWriter();
        i2 i2Var = new i2(stringWriter, this.f305817a.getMaxDepth());
        if (z10) {
            i2Var.h("\t");
        }
        i2Var.j(this.f305817a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.n1
    public <T> void a(@NotNull T t10, @NotNull Writer writer) throws IOException {
        io.sentry.util.y.c(t10, "The entity is required.");
        io.sentry.util.y.c(writer, "The Writer object is required.");
        ILogger logger = this.f305817a.getLogger();
        y7 y7Var = y7.DEBUG;
        if (logger.d(y7Var)) {
            this.f305817a.getLogger().c(y7Var, "Serializing object: %s", h(t10, this.f305817a.isEnablePrettySerializationOutput()));
        }
        new i2(writer, this.f305817a.getMaxDepth()).j(this.f305817a.getLogger(), t10);
        writer.flush();
    }

    @Override // io.sentry.n1
    public void b(@NotNull g6 g6Var, @NotNull OutputStream outputStream) throws Exception {
        io.sentry.util.y.c(g6Var, "The SentryEnvelope object is required.");
        io.sentry.util.y.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f305816c));
        try {
            g6Var.d().serialize(new i2(bufferedWriter, this.f305817a.getMaxDepth()), this.f305817a.getLogger());
            bufferedWriter.write("\n");
            for (m7 m7Var : g6Var.e()) {
                try {
                    byte[] bArrQ = m7Var.Q();
                    m7Var.S().serialize(new i2(bufferedWriter, this.f305817a.getMaxDepth()), this.f305817a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrQ);
                    bufferedWriter.write("\n");
                } catch (Exception e10) {
                    this.f305817a.getLogger().a(y7.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th2) {
            bufferedWriter.flush();
            throw th2;
        }
    }

    @Override // io.sentry.n1
    @Nullable
    public <T> T c(@NotNull Reader reader, @NotNull Class<T> cls) {
        T tCast;
        try {
            g2 g2Var = new g2(reader);
            try {
                a2<?> a2Var = this.f305818b.get(cls);
                if (a2Var != null) {
                    tCast = cls.cast(a2Var.a(g2Var, this.f305817a.getLogger()));
                } else {
                    if (!g(cls)) {
                        g2Var.close();
                        return null;
                    }
                    tCast = (T) g2Var.re();
                }
                g2Var.close();
                return tCast;
            } catch (Throwable th2) {
                try {
                    g2Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            this.f305817a.getLogger().a(y7.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.n1
    @Nullable
    public <T, R> T d(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable a2<R> a2Var) {
        try {
            g2 g2Var = new g2(reader);
            try {
                T t10 = (!Collection.class.isAssignableFrom(cls) || a2Var == null) ? (T) g2Var.re() : (T) g2Var.p8(this.f305817a.getLogger(), a2Var);
                g2Var.close();
                return t10;
            } catch (Throwable th2) {
                try {
                    g2Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f305817a.getLogger().a(y7.ERROR, "Error when deserializing", th4);
            return null;
        }
    }

    @Override // io.sentry.n1
    @Nullable
    public g6 e(@NotNull InputStream inputStream) {
        io.sentry.util.y.c(inputStream, "The InputStream object is required.");
        try {
            return this.f305817a.getEnvelopeReader().a(inputStream);
        } catch (IOException e10) {
            this.f305817a.getLogger().a(y7.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.n1
    @NotNull
    public String f(@NotNull Map<String, Object> map) throws Exception {
        return h(map, false);
    }
}
