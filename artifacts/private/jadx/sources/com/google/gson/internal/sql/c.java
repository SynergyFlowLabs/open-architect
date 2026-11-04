package com.google.gson.internal.sql;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.f;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
class c extends b0<Timestamp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final c0 f125515b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0<Date> f125516a;

    class a implements c0 {
        a() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(f fVar, com.google.gson.reflect.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Timestamp.class) {
                return new c(fVar.u(Date.class), aVar2);
            }
            return null;
        }
    }

    /* synthetic */ c(b0 b0Var, a aVar) {
        this(b0Var);
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(com.google.gson.stream.a aVar) throws IOException {
        Date date = this.f125516a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(com.google.gson.stream.d dVar, Timestamp timestamp) throws IOException {
        this.f125516a.write(dVar, timestamp);
    }

    private c(b0<Date> b0Var) {
        this.f125516a = b0Var;
    }
}
