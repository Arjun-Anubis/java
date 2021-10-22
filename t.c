int main() {
	int a;
	int *b;
	b = &a;
	b++;
	a = *b;
	printf("%d", a);
	}
