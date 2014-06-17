%Scalability Test

time = [2.56 2.4 2.34 38.57 11.51 11.96 11.71 11.25 3.11 3.18 3.11 3.96];
size = [33 33 33 33 129 129 129 129 65 65 65 65];
init = [10 30 100 500 10 30 100 500 10 30 100 500];

s33 = find(size == 33);
s65 = find(size == 65);
s129= find(size == 129);

figure()
hold on,
plot(init(s33), time(s33), 'r.-');
plot(init(s65), time(s65), 'b.-');
plot(init(s129), time(s129), 'g.-');

xlabel('Initial Bacteria Number', 'fontsize', 18);
ylabel('Computation Time (minutes)','fontsize',18);
I = legend('33x33 grid', '65x65 grid', '129x129 grid');
set(I, 'Box','off', 'Location', 'NorthWest')

time2 = [2.56 3.11 11.51 28.8];
grid = [33 65 129 257];
figure()
hold on
plot(grid,time2,'k--');
plot(grid(1), time2(1), 'ro','MarkerSize',15,'MarkerFaceColor','r')
plot(grid(2), time2(2), 'bo','MarkerSize',15,'MarkerFaceColor','b')
plot(grid(3), time2(3), 'go','MarkerSize',15,'MarkerFaceColor','g')
plot(grid(4), time2(4), 'mo','MarkerSize',15,'MarkerFaceColor','m')
ylabel('Computation Time (minutes)','FontSize',18);
xlabel('Domain Grid Size (NxN)','FontSize',18);
