package com.rabbitmq.client;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public interface k extends k1, AutoCloseable {
    a.g.d A4(String str) throws IOException;

    String A7(String str, boolean z10, String str2, t tVar) throws IOException;

    String B6(String str, boolean z10, Map<String, Object> map, t tVar) throws IOException;

    void Be(b1 b1Var);

    p C0();

    boolean C2(long j10) throws InterruptedException, TimeoutException;

    a.g.d Cb(String str, i iVar, boolean z10, boolean z11, Map<String, Object> map) throws IOException;

    String D7(String str, boolean z10, String str2, b0 b0Var, j jVar, v vVar) throws IOException;

    a.e.b D8() throws IOException;

    void D9(long j10, boolean z10) throws IOException;

    void Db(o oVar);

    a.g.h De(String str, String str2, String str3) throws IOException;

    void E8(String str, boolean z10, boolean z11) throws IOException;

    long F4(String str) throws IOException;

    a.b.p Fc(boolean z10) throws IOException;

    m G5(o0 o0Var) throws IOException;

    void Gd() throws InterruptedException, IOException;

    void I5(int i10) throws IOException;

    void Ie(String str, i iVar, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException;

    String K2(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, b0 b0Var, j jVar, v vVar) throws IOException;

    a.b.p L4() throws IOException;

    a.i.d L7(String str, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException;

    a.g.f Le(String str, boolean z10) throws IOException;

    void M5(String str, String str2, boolean z10, boolean z11, a.c cVar, byte[] bArr) throws IOException;

    void Ne();

    boolean O3() throws InterruptedException;

    void O9(String str, String str2, String str3, Map<String, Object> map) throws IOException;

    a.g.d P1(String str, i iVar, boolean z10) throws IOException;

    void Pa(int i10, boolean z10) throws IOException;

    void Qc(String str, String str2, String str3, Map<String, Object> map) throws IOException;

    void Qe();

    void R1(int i10, int i11, boolean z10) throws IOException;

    a.g.b R3(String str, String str2, String str3) throws IOException;

    void Tc(t tVar);

    void U4(String str, boolean z10) throws IOException;

    String Ua(String str, boolean z10, String str2, b0 b0Var, j jVar) throws IOException;

    boolean Ub(b1 b1Var);

    a.i.b V2(String str, String str2, String str3, Map<String, Object> map) throws IOException;

    String V7(String str, boolean z10, String str2, b0 b0Var, v vVar) throws IOException;

    int V8();

    void W1(String str, String str2, boolean z10, a.c cVar, byte[] bArr) throws IOException;

    String Wb(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, b0 b0Var, v vVar) throws IOException;

    a.g.d X7(String str, String str2, boolean z10) throws IOException;

    void Xb(String str, String str2, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException;

    void Z1(o0 o0Var) throws IOException;

    String Z9(String str, boolean z10, b0 b0Var, j jVar, v vVar) throws IOException;

    a.i.j Zd(String str, String str2, String str3, Map<String, Object> map) throws IOException;

    a.g.d a2(String str, i iVar) throws IOException;

    a.j.b a8() throws IOException;

    void abort() throws IOException;

    a.j.f ac() throws IOException;

    String ad(String str, boolean z10, Map<String, Object> map, b0 b0Var, v vVar) throws IOException;

    a.i.d b3(String str) throws IOException;

    a.i.j bc(String str, String str2, String str3) throws IOException;

    a.g.d c3(String str, String str2) throws IOException;

    h0 ca(String str, boolean z10) throws IOException;

    void close() throws TimeoutException, IOException;

    void close(int i10, String str) throws TimeoutException, IOException;

    String d3(String str, boolean z10, Map<String, Object> map, b0 b0Var, j jVar, v vVar) throws IOException;

    void d5(String str) throws IOException;

    void d6(String str, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException;

    o e4(n nVar, n nVar2);

    String ec(String str, boolean z10, Map<String, Object> map, b0 b0Var, j jVar) throws IOException;

    a.g.d fc(String str, String str2, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException;

    a.g.d g9(String str, String str2, boolean z10, boolean z11, Map<String, Object> map) throws IOException;

    a.i.h gb(String str) throws IOException;

    a.i.f gc(String str) throws IOException;

    long gf(String str) throws IOException;

    a.j.d id() throws IOException;

    CompletableFuture<m> j6(o0 o0Var) throws IOException;

    a.i.d k6() throws IOException;

    String l4(String str, b0 b0Var, j jVar) throws IOException;

    a.i.f lc(String str, boolean z10, boolean z11) throws IOException;

    void le(String str, String str2, a.c cVar, byte[] bArr) throws IOException;

    a.g.d m9(String str, i iVar, boolean z10, boolean z11, boolean z12, Map<String, Object> map) throws IOException;

    b1 me(a1 a1Var);

    String o5(String str, t tVar) throws IOException;

    String p3(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, t tVar) throws IOException;

    String pc(String str, boolean z10, b0 b0Var, v vVar) throws IOException;

    void q3(long j10, boolean z10, boolean z11) throws IOException;

    t q4();

    a.g.b q9(String str, String str2, String str3, Map<String, Object> map) throws IOException;

    boolean qb(o oVar);

    a.g.h qc(String str, String str2, String str3, Map<String, Object> map) throws IOException;

    void r1(int i10, String str) throws IOException;

    String t6(String str, boolean z10, b0 b0Var, j jVar) throws IOException;

    String t8(String str, boolean z10, String str2, boolean z11, boolean z12, Map<String, Object> map, b0 b0Var, j jVar) throws IOException;

    void tc(long j10) throws InterruptedException, TimeoutException, IOException;

    a.i.b vb(String str, String str2, String str3) throws IOException;

    long vd();

    a.g.f ve(String str) throws IOException;

    String we(String str, boolean z10, t tVar) throws IOException;

    String xe(String str, b0 b0Var, v vVar) throws IOException;

    String yc(String str, b0 b0Var, j jVar, v vVar) throws IOException;

    void z6(long j10, boolean z10) throws IOException;

    void zb(String str, String str2, String str3, Map<String, Object> map) throws IOException;
}
