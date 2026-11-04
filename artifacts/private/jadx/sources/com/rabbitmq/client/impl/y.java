package com.rabbitmq.client.impl;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes13.dex */
public class y {
    private f0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e0 f265890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f265891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f265892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f265893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f265894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f265895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f265896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f265897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f265898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f265899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f265900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.rabbitmq.client.h1 f265901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f265902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.rabbitmq.client.x0 f265903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f265904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ExecutorService f265905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f265906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f265907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p0 f265908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f265909t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.rabbitmq.client.impl.recovery.i0 f265910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Predicate<com.rabbitmq.client.l1> f265911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.rabbitmq.client.impl.recovery.g0 f265912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.rabbitmq.client.g0 f265913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ThreadFactory f265914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.rabbitmq.client.g2 f265915z;

    public boolean A() {
        return this.f265904o;
    }

    public void B(int i10) {
        this.f265906q = i10;
    }

    public void C(boolean z10) {
        this.f265907r = z10;
    }

    public void D(Map<String, Object> map) {
        this.f265895f = map;
    }

    public void E(Predicate<com.rabbitmq.client.l1> predicate) {
        this.f265911v = predicate;
    }

    public void F(ExecutorService executorService) {
        this.f265891b = executorService;
    }

    public void G(e0 e0Var) {
        this.f265890a = e0Var;
    }

    public void H(f0 f0Var) {
        this.A = f0Var;
    }

    public void I(p0 p0Var) {
        this.f265908s = p0Var;
    }

    public void J(com.rabbitmq.client.g0 g0Var) {
        this.f265913x = g0Var;
    }

    public void K(int i10) {
        this.f265899j = i10;
    }

    public void L(ScheduledExecutorService scheduledExecutorService) {
        this.f265892c = scheduledExecutorService;
    }

    public void M(long j10) {
        this.f265902m = j10;
    }

    public void N(com.rabbitmq.client.x0 x0Var) {
        this.f265903n = x0Var;
    }

    public void O(int i10) {
        this.f265897h = i10;
    }

    public void P(int i10) {
        this.f265896g = i10;
    }

    public void Q(int i10) {
        this.f265898i = i10;
    }

    public void R(com.rabbitmq.client.h1 h1Var) {
        this.f265901l = h1Var;
    }

    public void S(ExecutorService executorService) {
        this.f265893d = executorService;
    }

    public void T(int i10) {
        this.f265900k = i10;
    }

    public void U(ThreadFactory threadFactory) {
        this.f265914y = threadFactory;
    }

    public void V(boolean z10) {
        this.f265904o = z10;
    }

    public void W(ExecutorService executorService) {
        this.f265905p = executorService;
    }

    public void X(com.rabbitmq.client.impl.recovery.i0 i0Var) {
        this.f265910u = i0Var;
    }

    public void Y(com.rabbitmq.client.impl.recovery.g0 g0Var) {
        this.f265912w = g0Var;
    }

    public void Z(com.rabbitmq.client.g2 g2Var) {
        this.f265915z = g2Var;
    }

    public boolean a() {
        return this.f265907r;
    }

    public void a0(String str) {
        this.f265894e = str;
    }

    public int b() {
        return this.f265906q;
    }

    public void b0(int i10) {
        this.f265909t = i10;
    }

    public Map<String, Object> c() {
        return this.f265895f;
    }

    public Predicate<com.rabbitmq.client.l1> d() {
        return this.f265911v;
    }

    public ExecutorService e() {
        return this.f265891b;
    }

    public e0 f() {
        return this.f265890a;
    }

    public f0 g() {
        return this.A;
    }

    public p0 h() {
        return this.f265908s;
    }

    public com.rabbitmq.client.g0 i() {
        return this.f265913x;
    }

    public int j() {
        return this.f265899j;
    }

    public ScheduledExecutorService k() {
        return this.f265892c;
    }

    public long l() {
        return this.f265902m;
    }

    public com.rabbitmq.client.x0 m() {
        com.rabbitmq.client.x0 x0Var = this.f265903n;
        return x0Var == null ? new com.rabbitmq.client.x0.a(this.f265902m) : x0Var;
    }

    public int n() {
        return this.f265897h;
    }

    public int o() {
        return this.f265896g;
    }

    public int p() {
        return this.f265898i;
    }

    public com.rabbitmq.client.h1 q() {
        return this.f265901l;
    }

    public ExecutorService r() {
        return this.f265893d;
    }

    public int s() {
        return this.f265900k;
    }

    public ThreadFactory t() {
        return this.f265914y;
    }

    public ExecutorService u() {
        return this.f265905p;
    }

    public com.rabbitmq.client.impl.recovery.i0 v() {
        return this.f265910u;
    }

    public com.rabbitmq.client.impl.recovery.g0 w() {
        return this.f265912w;
    }

    public com.rabbitmq.client.g2 x() {
        return this.f265915z;
    }

    public String y() {
        return this.f265894e;
    }

    public int z() {
        return this.f265909t;
    }
}
