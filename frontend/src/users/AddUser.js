import React from 'react'

export default function AddUser() {
  return (
    <div className="container">
        <div className="row">
            <div className="col-md-6 offset-md-3 text-center border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Add product</h2>
                <div className="text-center mb-3" >
                    <label htmlFor="Name" className="form-label">
                       Name
                    </label>
                    <input
                    type={"text"}
                    className="form-control"
                    placeholder="Enter item name"
                    name='name'
                    ></input>
                </div>
                <div className="mb-3" >
                    <label htmlFor="Name" className="form-label">
                       price
                    </label>
                    <input
                    type={"number"}
                    className="form-control"
                    placeholder="Enter item price"
                    name='name'
                    ></input>
                </div>
                <div className="mb-3" >
                    <label htmlFor="Name" className="form-label">
                       count
                    </label>
                    <input
                    type={"number"}
                    className="form-control"
                    placeholder="Enter number sold"
                    name='name'
                    ></input>
                </div>
                <button type='submit' className='btn btn-outline-primary'>Submit</button>
            </div>
        </div>
    </div>
  )
}
