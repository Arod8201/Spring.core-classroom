-- 每一個有工作指派的員工的工作列表
select e.ename , j.jname
from emp e, job j
where e.eid = j.eid 
order by e.ename;

-- 每一個員工有幾項工作 - 1 ? (交集)
select e.ename, count(j.jname) as total
from emp e inner join job j on e.eid = j.eid
group by e.ename
order by e.ename; 

-- 每一個員工有幾項工作 - 2 ? (交集)
select e.ename, count(j.jname) as total
from emp e, job j 
where e.eid = j.eid 
group by e.ename
order by e.ename; 

-- 每一個員工有幾項工作 - 3 ? (left join 向左關聯)
select e.ename, count(j.jname) as total
from emp e left join job j on e.eid = j.eid 
group by e.ename
order by e.ename; 

-- 沒有工作的員工
select e.ename
from emp e left join job j on e.eid = j.eid 
where j.eid is null;

-- 沒有員工的工作
select j.jname 
from job j left join emp e on j.eid  = e.eid  
where e.eid is null;

select j.jname 
from emp e right join job j on e.eid = j.eid 
where j.eid  is null;

select j.jname
from job j 
where j.eid is null;

