import { Routes, Route } from 'react-router-dom';
import Login from './Login.jsx';
import Sign from './Sign.jsx';
import Home from './Home.jsx';

import EmpMain from './EmpMain.jsx'

import All from "../features/hrm_ref/pages/All.jsx";
import Dept from "../features/hrm_ref/pages/Dept.jsx";
import Emp from "../features/hrm_ref/pages/Emp.jsx";

import Calender from "../features/schedule/pages/Calender.jsx";
import Project from "../features/schedule/pages/Project.jsx";
import ProjectManage from "../features/schedule/pages/ProjectManage.jsx";
import Meeting from "../features/schedule/pages/Meeting.jsx";

import Dispatch from "../features/hrm_ref/pages/Outsourcing.jsx";
import EmpSign from "./EmpSign.jsx";

import Record from "../features/invite/Record.jsx";

import Outsourcing from "../features/hrm_ref/pages/Outsourcing.jsx";
function Router() {
    return (
        <Routes>
            <Route path="/" element={<Login />} />
            <Route path="/sign" element={<Sign />} />
            <Route path="/empsign" element={<EmpSign />} />
            <Route path="/main" element={<Home />}>
                <Route index  element={<Calender/>}/>   {/* /main */}

                <Route path="invite">
                    <Route path="record"   element={<Record/>}/>
                </Route>

                <Route path="hr">
                    <Route path="all"   element={<All />}/>
                    <Route path="dept"  element={<Dept />}/>
                    <Route path="emp"   element={<Emp />}/>
                    <Route path="outsourcing"   element={<Outsourcing />}/>
                </Route>

                <Route path="schedule">
                <Route path="calendar"   element={<Calender />}/>
                <Route path="project" element={<Project />}/>
                <Route path="admin/projectmanage" element={<ProjectManage />}/>
                <Route path="meeting" element={<Meeting />}/>
                </Route>

            </Route>
        </Routes>
    );
}

export default Router;
